package topic4.topic4.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.WebColors;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Link;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;

import topic4.topic4.model.Data;

@Service
public class ConverterServiceImpl implements ConverterService {

	@Autowired
	private DataService dataService;

	public File pdf() throws FileNotFoundException, MalformedURLException {
		String fileName = "template.pdf";
		// location of pdf-file is stored on the server
		String dest = "./target/classes/static/pdfs/" + fileName;

		PdfWriter writer = new PdfWriter(dest);
		PdfDocument pdf = new PdfDocument(writer);
		Document document = new Document(pdf);

		// add image in pdf
		File logo = ResourceUtils.getFile("classpath:static/images/eGECKO.jpg");
		ImageData data = ImageDataFactory.create(logo.getAbsolutePath());
		Image image = new Image(data);
		image.setMarginLeft(315);
		image.setMarginBottom(30);
		document.add(image.setWidthPercent(40));

		// dynamic column. the number of columns is determined by positionX.
		int maxPositionX = dataService.getMaxPositionX() + 1;
		float columnWidths[];
		columnWidths = new float[maxPositionX];
		for (int i = 0; i < maxPositionX; i++) {
			columnWidths[i] = maxPositionX;
		}

		Table table = new Table(UnitValue.createPercentArray(columnWidths));

		// create 2D matrix for row and column. This matrix generates cell
		Data[][] matrix = dataService.getMatrix();
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				Data current = matrix[row][col];
				Cell cell = new Cell();
				if (current == null) {
					cell.add("").setHeight(45);
				} else {
					cell.add(current.getValue()).setHeight(45);
					cell.setBackgroundColor(WebColors.getRGBColor(current.getBackground()));
				}
				table.addCell(cell);
			}
		}

		document.add(table);

		Paragraph address = new Paragraph();
		address.add("CSS AG Friedrich-Dietz- Str. 1");
		address.add("36093 Künzell");
		address.setFixedPosition(75, 130, 170);
		document.add(address);

		PdfAction action = PdfAction.createURI(" https://www.css.de/");
		Link link = new Link(" www.css.de", action);

		Paragraph contact = new Paragraph();
		contact.add("+49 (0) 661/9392-0 info@css.de ");
		contact.add(link.setUnderline().setFontColor(WebColors.getRGBColor("#82BC00")));
		contact.setFixedPosition(330, 130, 170);
		document.add(contact);

		File img1 = ResourceUtils.getFile("classpath:static/images/data.jpg");
		ImageData data_img1 = ImageDataFactory.create(img1.getAbsolutePath());
		Image image1 = new Image(data_img1);
		image1.setFixedPosition(70, 40);
		document.add(image1.setWidthPercent(40));

		File img2 = ResourceUtils.getFile("classpath:static/images/CSS.jpg");
		ImageData data_img2 = ImageDataFactory.create(img2.getAbsolutePath());
		Image image2 = new Image(data_img2);
		image2.setFixedPosition(330, 30);
		document.add(image2.setWidthPercent(40));

		document.close();

		File template = ResourceUtils.getFile("classpath:static/pdfs/" + fileName);
		return template;
	}
}

package topic4.topic4.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import topic4.topic4.model.Data;
import topic4.topic4.service.ConverterService;
import topic4.topic4.service.DataService;

@Controller
public class DataController {
  @Autowired
  private DataService dataService;
  @Autowired
  private ConverterService converterService;

  @GetMapping("/")
  public String home(Model model) {
    Data[][] data = dataService.getMatrix();
    model.addAttribute("data", data);
    return "index";
  }

  @GetMapping("/export")
  public ResponseEntity<InputStreamResource> pdfGenerator() throws FileNotFoundException, IOException  {
	    File template = converterService.pdf();
      InputStreamResource resource = new InputStreamResource(new FileInputStream(template));
    
      return ResponseEntity.ok()
    		  .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + template.getName())
    		  .contentType(MediaType.APPLICATION_OCTET_STREAM)
    		  .contentLength(template.length())
    		  .body(resource);
      
  } 
}
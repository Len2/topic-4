package topic4.topic4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faelligk_zelle_id")
    private String faelligk_zelle_id;

    @Column(name = "opstichtag_id")
    private String opstichtag_id;

    @Column(name = "orgunit_nr")
    private int orgunit_nr;

    @Column(name = "position_x")
    private int position_x;

    @Column(name = "position_y")
    private int position_y;

    @Column(name = "background")
    private String background;

    @Column(name = "flag")
    private int flag;

    @Column(name = "font")
    private String font;

    @Column(name = "foreground")
    private String foreground;

    @Column(name = "format")
    private String format;

    @Column(name = "formel")
    private String formel;

    @Column(name = "heigh")
    private String heigh;

    @Column(name = "h_alignment")
    private int h_alignment;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private String value;

    @Column(name = "v_alignment")
    private int v_alignment;

    @Column(name = "c_width")
    private int c_width;

    @Column(name = "object_id")
    private String object_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFaelligkZelleId() {
        return faelligk_zelle_id;
    }

    public void setFaelligkZelleId(String faelligkZelleId) {
        this.faelligk_zelle_id = faelligkZelleId;
    }

    public String getOpstichtagId() {
        return opstichtag_id;
    }

    public void setOpstichtagId(String opstichtagId) {
        this.opstichtag_id = opstichtagId;
    }

    public int getOrgunitNr() {
        return orgunit_nr;
    }

    public void setOrgunitNr(int orgunitNr) {
        this.orgunit_nr = orgunitNr;
    }

    public int getPositionX() {
        return position_x;
    }

    public void setPositionX(int positionX) {
        this.position_x = positionX;
    }

    public int getPositionY() {
        return position_y;
    }

    public void setPositionY(int positionY) {
        this.position_y = positionY;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getflag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getfont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getForeground() {
        return foreground;
    }

    public void setForeground(String foreground) {
        this.foreground = foreground;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormel() {
        return formel;
    }

    public void setFormel(String formel) {
        this.formel = formel;
    }

    public String getHeigh() {
        return heigh;
    }

    public void setHeigh(String heigh) {
        this.heigh = heigh;
    }

    public int getHAlignment() {
        return h_alignment;
    }

    public void setHAlignment(int hAlignment) {
        this.h_alignment = hAlignment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getVAlignment() {
        return v_alignment;
    }

    public void setVAlignment(int vAlignment) {
        this.v_alignment = vAlignment;
    }

    public int getCWidth() {
        return c_width;
    }

    public void setCWidth(int cWidth) {
        this.c_width = cWidth;
    }

    public String getObjectId() {
        return object_id;
    }

    public void setObjectId(String objectId) {
        this.object_id = objectId;
    }
}

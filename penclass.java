public class penclass {
    public static void main(String[] args){
        Pen_manager pn = new Pen_manager(20, 90, "layla-cure", "skywhite");
        pn.showpeninfo();
        Pen_manager blue = new Pen_manager(20, 4, "ㅠㅣㅕㄷ", "BLUE");
        blue.showpeninfo();
    }
}
class PEN{
    int pen_width;
    int ink_level;
    String Pen_name;
    String Pen_color;
    boolean Pen_open = false;
    static String Pen_constructor = "Artsnoa.INC";

    void openPEN(){
        this.Pen_open = true;
    }
    void ClosePen(){
        this.Pen_open = false;
    }
    void setpencolor(String _color){
        this.Pen_color = _color;
    }
    void SetPENNAME(String _name){
        this.Pen_name = _name;
    }
    void Setpenwidth(int _width){
        this.pen_width = _width;
    }
    void SetInkLevel(int _ink){
        this.ink_level = _ink;
    }
    int Pen_width(){
        return this.pen_width;
    }
    int Getinklevel(){
        return this.ink_level;
    }
    String GetPenName(){
        return this.Pen_name;
    }
    String GetPencolor(){
        return this.Pen_color;
    }
    int Getpenwidth(){
        return this.pen_width;
    }
}
class Pen_manager{
    PEN p = new PEN();
    Pen_manager(int _ink, int _width){
        p.SetInkLevel(_ink);
        p.Setpenwidth(_width);
    }
    Pen_manager(int _ink, int _width, String _penname, String _pencolor){
        this(_ink, _width);
        p.SetPENNAME(_penname);
        p.setpencolor(_pencolor);
    }
    void showpeninfo(){
        System.out.printf("펜의 이름은 %s, 펜의 길이는 %d, 펜의 잉크 레벨은 %d, 펜의 제조사는 %s, 펜의 컬러는 %s", p.GetPenName(), p.Getpenwidth(), p.Getinklevel(), PEN.Pen_constructor, p.GetPencolor());
    }
}
package cap03metodos;
public class P0301Hora {
    public int hor, min, seg;
    public void setHorario(int h, int m, int s) {
        hor = h;
        min = m;
        seg = s;
    }
    public String toString() {
        return hor + ":" + min + ":" + seg;
    }
}

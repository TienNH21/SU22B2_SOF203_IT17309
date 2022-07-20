package lesson5;

import java.util.ArrayList;

public class SanPhamService {
    private ArrayList<SanPham> listSP;
    
    public SanPhamService()
    {
        this.listSP = new ArrayList<>();
    }
    
    public void insert(SanPham sp)
    {
        this.listSP.add(sp);
    }
    
    public void update(int id, SanPham sp)
    {
        for (int i = 0; i < this.listSP.size(); i++) {
            if (this.listSP.get(i).getId() == id) {
                this.listSP.set(i, sp);
            }
        }
    }
    
    public void delete(int id)
    {
        for (int i = 0; i < this.listSP.size(); i++) {
            if (this.listSP.get(i).getId() == id) {
                this.listSP.remove(i);
            }
        }
    }
    
    public ArrayList<SanPham> getListSP()
    {
        return this.listSP;
    }
}

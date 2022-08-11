package developers.barang.services;

import developers.barang.model.Barang;

import java.util.List;

public interface BarangServices {
    public Barang save(Barang obj);
    public Barang update(Barang obj);

    public List<Barang> deleted(Long id);
    public List<Barang> dataMhs(int row,int page);

    public Barang findById(long obj);

}

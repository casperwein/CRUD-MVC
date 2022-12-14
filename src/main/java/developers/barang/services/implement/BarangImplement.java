package developers.barang.services.implement;

import developers.barang.model.Barang;
import developers.barang.services.BarangServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BarangImplement implements BarangServices {
    static List<Barang> listMhs = new ArrayList<>();
    @Override
    public Barang save(Barang obj) {
        obj.setId(1L);
        listMhs.add(obj);
        return obj;
    }

    @Override
    public Barang update(Barang obj) {
        for(Barang data : listMhs){
            if(obj.getId().equals(data.getId())){
                Barang update = new Barang();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setSatuan(data.getSatuan());
                update.setStok(data.getStok());
                listMhs.remove(data);
                listMhs.add(update);
                return update;
            }
        }
        return null;
    }

    @Override
    public List<Barang> deleted(Long id) {
        for(Barang data : listMhs){
            if(id.equals(data.getId())){
                Barang update = new Barang();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setSatuan(data.getSatuan());
                update.setStok(data.getStok());
                listMhs.remove(data);

                return listMhs;
            }
        }
        return null;
    }

    @Override
    public List<Barang> dataMhs(int row, int page) {
        return listMhs;
    }

    @Override
    public Barang findById(long obj) {
        for(Barang data : listMhs){
            if(obj == data.getId()){
                return data;
            }
        }
        return null;
    }

}

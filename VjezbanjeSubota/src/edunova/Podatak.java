
package edunova;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Podatak {

    private List<Data> data = null;
    private Meta meta;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }


}

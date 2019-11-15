

public class HashTable {
   public Entry[] data;
    public HashTable()
    {
        data = new Entry[101];
    }

    public HashTable(int initCap)
    {
        data = new Entry[initCap];
    }
    Object put(Object key,Object value){
        int index = key.hashCode() % data.length;
        Object returnVal = data[index];
        data[index] = new Entry(key,value);
        return returnVal;
    }
    Object get(Object key)
    {
        return data[key.hashCode()%data.length].val;
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        for (int i=0;i<data.length;i++)
        {
           if (data[i] != null) res.append(data[i]).append(" ");
        }
        return res.toString();
    }
}
class Entry{
    public Object key;
    public Object val;
    public Entry()
    {
        key = null;
        val = null;
    }
    public Entry(Object key, Object val)
    {
        this.key = key;
        this.val = val;
    }
    @Override
    public String toString()
    {
        return "<" + key + "," + val + ">";
    }
}

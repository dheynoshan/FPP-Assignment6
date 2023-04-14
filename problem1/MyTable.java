package problem1;

public class MyTable {
    Entry[] entries = new Entry[26];

    public void add(char c, String s){
        int pos = c-97;
        if(pos>=0 && pos<26)
            entries[pos] = new Entry(c,s);
    }
    public String get(char c){
        int pos = c-97;
        if(pos>=0 && pos<26) {
            Entry ent = entries[pos];
            if (ent != null)
                return ent.s;
            else
                return null;
        }
        else
            return null;
    }

    @Override
    public String toString(){
        String str = "";
        for(Entry e : entries){
            if(e!=null){
                str += e.toString() +"\n";
            }
        }

        return str;
    }
    public class Entry{
        private char c;
        private String s;
        public Entry(char c, String s){
            this.c = c;
            this.s = s;
        }
        @Override
        public String toString(){
            return c + "->" + s;
        }

    }
}

package C_09082024.Collections;

public class ComparebleClas implements Comparable<ComparebleClas> {

    String sub_id;
    String sub_name;

    public ComparebleClas(String sub_id, String sub_name) {
        this.sub_id = sub_id;
        this.sub_name = sub_name;
    }

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }
    public String toString() {
        return "ComperableClas{" +"Sub-id="  +sub_id+ ", Sub-name='" +sub_name + '\'' +'}';
    }

    @Override
    public int compareTo(ComparebleClas o) {
        return CharSequence.compare(this.sub_id,o.sub_id);
    }
}

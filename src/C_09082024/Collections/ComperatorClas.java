package C_09082024.Collections;

import java.util.Comparator;
//1. sort by sub_id in ascending order
class SortIdByAscSubId  implements Comparator<ComperatorClas>
{
    @Override
    public int compare(ComperatorClas o1, ComperatorClas o2) {
        //for ascending order
        return o1.getSub_id().compareTo(o2.getSub_id());
    }
    }
//2.sort by sub_id in descending order
class SortIdByDscSubId implements Comparator<ComperatorClas>
{
    @Override
    public int compare(ComperatorClas o1, ComperatorClas o2) {
        //for descending order
        return o2.getSub_id().compareTo(o1.getSub_id());
    }}

//3. sort by subject-id ascending
class SortIdBySubName implements Comparator<ComperatorClas>
{
    @Override
    public int compare(ComperatorClas o1, ComperatorClas o2) {
        //for descending order
        return o1.getSub_name().compareTo(o2.getSub_id());
    }}
//4. sort by sub_id in descending order
class SortIdBySubName2 implements Comparator<ComperatorClas>
{
    @Override
    public int compare(ComperatorClas o1, ComperatorClas o2) {
        //for descending order
        return o2.getSub_id().compareTo(o1.getSub_name());
    }}


public class ComperatorClas {
    String sub_id;
    String sub_name;

    public ComperatorClas(String sub_id, String sub_name) {
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
        return "ComperatorClas{" +"Sub-id="  +sub_id+ ", Sub-name='" +sub_name + '\'' +'}';
    }
}

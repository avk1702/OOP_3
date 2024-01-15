package OOP_3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {

    @Override
    public int compare(Flow flow1, Flow flow2) {
        int groupCount1 = flow1.getStudentGroups().size();
        int groupCount2 = flow2.getStudentGroups().size();

        return Integer.compare(groupCount1, groupCount2);
    }
}

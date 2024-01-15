package OOP_3;

import java.util.Collections;
import java.util.List;

public class FlowService {

    public void sortFlowList(List<Flow> flowList) {
        StreamComparator comparator = new StreamComparator();
        Collections.sort(flowList, comparator);
    }
}

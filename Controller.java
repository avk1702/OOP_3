package OOP_3;

import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final FlowService flowService = new FlowService();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public void sortFlowList(List<Flow> flowList) {
        flowService.sortFlowList(flowList);
    }

    public void sortFlow(List<Flow> flowList) {
        flowService.sortFlowList(flowList);
    }
}
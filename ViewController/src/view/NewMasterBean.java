package view;

import java.util.HashMap;
import java.util.Map;

import oracle.adf.controller.TaskFlowId;

public class NewMasterBean {
    private Map<String, Object> parameterMap = new HashMap<String, Object>();
    private String taskFlowId = "/WEB-INF/task-flow-definition1.xml#task-flow-definition1";
    private String myText = "the quick brown fox";

    public void setParameterMap(Map<String, Object> parameterMap) {
        this.parameterMap = parameterMap;
    }

    public Map<String, Object> getParameterMap() {
        return parameterMap;
    }

    public NewMasterBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String taskflowdefinition1() {
        setDynamicTaskFlowId("/WEB-INF/task-flow-definition1.xml#task-flow-definition1");
        getParameterMap().put("Parameter1", "This is a test TF1");
        myText = "This is a test TF1";
        return null;
    }

    public String taskflowdefinition2() {
        setDynamicTaskFlowId("/WEB-INF/task-flow-definition2.xml#task-flow-definition2");
        getParameterMap().put("Parameter1", "This is a test TF2");
        myText = "This is a test TF2";
        return null;
    }

    public String taskflowdefinition3() {
        setDynamicTaskFlowId("/WEB-INF/task-flow-definition1.xml#task-flow-definition1");
        getParameterMap().put("Parameter1", "This is a test TF1 from Tab3");
        myText = "This is a test TF1 from Tab3";
        return null;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

    public String getMyText() {
        return myText;
    }
}

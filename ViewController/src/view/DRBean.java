package view;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichLink;

public class DRBean implements Serializable {
    private String taskFlowId = "/WEB-INF/task-flow-definition1.xml#task-flow-definition1";
    private Map<String, Object> parameterMap = new HashMap<String, Object>();
    String srt = "TASKFLOW 1";
    private RichLink tf1Bind;
    private RichLink tf2Bind;
    private RichLink tf3Bind;
    private RichPanelGroupLayout pgBind;

    public void setParameterMap(Map<String, Object> parameterMap) {
        this.parameterMap = parameterMap;
    }

    public Map<String, Object> getParameterMap() {
        return parameterMap;
    }

    public DRBean() {
        setParameterVal();
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String taskflowdefinition1() {
        srt = "TASKFLOW 1";
        setParameterVal();
        setDynamicTaskFlowId("/WEB-INF/task-flow-definition1.xml#task-flow-definition1");
        return null;
    }

    public void tf3Listener(ActionEvent e) {
        srt = "TASKFLOW 1 called from 3rd Tab";

    }

    public void tf1Listener(ActionEvent actionEvent) {
        // Add event code here...
        srt = "TASKFLOW 1";
    }

    public String taskflowdefinition2() {
        srt = "TASKFLOW 1 called from 2nd Tab";
        setParameterVal();
        getParameterMap().put("time", "x");
        
        setDynamicTaskFlowId("/WEB-INF/task-flow-definition2.xml#task-flow-definition2");
        return null;
    }

    private void setParameterVal() {
        parameterMap.put("Parameter1", srt);
    }

    public void setTf1Bind(RichLink tf1Bind) {
        this.tf1Bind = tf1Bind;
    }

    public RichLink getTf1Bind() {
        return tf1Bind;
    }

    public void setTf2Bind(RichLink tf2Bind) {
        this.tf2Bind = tf2Bind;
    }

    public RichLink getTf2Bind() {
        return tf2Bind;
    }

    public void setTf3Bind(RichLink tf3Bind) {
        this.tf3Bind = tf3Bind;
    }

    public RichLink getTf3Bind() {
        return tf3Bind;
    }


    public void setPgBind(RichPanelGroupLayout pgBind) {
        this.pgBind = pgBind;
    }

    public RichPanelGroupLayout getPgBind() {
        return pgBind;
    }
}

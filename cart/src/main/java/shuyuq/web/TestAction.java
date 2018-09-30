package shuyuq.web;


import org.springframework.stereotype.Component;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

/**
 * @author shuyuq
 * @date 2018/9/28 14:54
 */
@Component
public class TestAction extends AbstractAction {
    @Override
    protected Event doExecute(RequestContext context) throws Exception {
        String  userName = (String)context.getRequestScope().get("userName");
        return success();
    }
}

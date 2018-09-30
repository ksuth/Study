package shuyuq.web;

import org.springframework.stereotype.Component;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

/**
 * @author shuyuq
 * @date 2018/9/28 15:24
 */
@Component
public class SubFlow extends AbstractAction {
    @Override
    protected Event doExecute(RequestContext context) throws Exception {
        if(null != context.getConversationScope().get("userName")){
            System.out.println("111111111111111111");
        }
        return success();
    }
}

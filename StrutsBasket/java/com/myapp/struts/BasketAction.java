
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author magda
 */
public class BasketAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS1 = "success1";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        BasketForm formBean = (BasketForm)form;
        double  cafe = formBean.getCafe();
        double sugar = formBean.getSugar();
        double water = formBean.getWater();
        
        formBean.setTotalCafe(cafe);
        formBean.setTotalSugar(sugar);
        formBean.setTotalWater(water);
        
        double totalCafe=formBean.getTotalCafe();
        double totalSugar=formBean.getTotalSugar();
        double totalWater=formBean.getTotalWater();
         
        formBean.setTotal(totalCafe,totalSugar,totalWater);
        
        return mapping.findForward(SUCCESS1);
    }
}

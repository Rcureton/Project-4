
package com.datenyc.mom.datenyc.Theatre.TicketmasterAPI;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Self {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("templated")
    @Expose
    private boolean templated;

    /**
     * 
     * @return
     *     The href
     */
    public String getHref() {
        return href;
    }

    /**
     * 
     * @param href
     *     The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 
     * @return
     *     The templated
     */
    public boolean isTemplated() {
        return templated;
    }

    /**
     * 
     * @param templated
     *     The templated
     */
    public void setTemplated(boolean templated) {
        this.templated = templated;
    }

}

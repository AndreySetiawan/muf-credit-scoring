package id.atiila.creditscoring;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LoanApplication implements Serializable {

	static final long serialVersionUID = 1L;

    protected Map<String, Object> attribute = new HashMap<>();

    protected Map<String, Object> params = new HashMap<>();

    protected Map<String, Object> results = new HashMap<>();

	private String idApplication;
	
	public LoanApplication() {
	}

	public String getIdApplication() {
		return this.idApplication;
	}

	public void setIdApplication(String idApplication) {
		this.idApplication = idApplication;
	}

	public LoanApplication(String idApplication) {
		this.idApplication = idApplication;
	}

    public Map<String, Object> getAttribute() {
        return attribute;
    }

    public void setAttribute(Map<String, Object> attribute) {
        this.attribute = attribute;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public Map<String, Object> getResults() {
        return results;
    }

    public void setResults(Map<String, Object> results) {
        this.results = results;
    }

    public Object valueInt(String key) {
		return params.get(key);
	}
	
	public Object valueDbl(String key) {
		return params.get(key);
	}

	public Object value(String key) {
		return params.get(key);
	}

	public Date valueDate(String key) {
		ZonedDateTime value = ZonedDateTime.parse((String) params.get(key));
		return Date.from(value.toInstant());
	}

	public void putMapItem(String varKey, Object varValue){
        this.results.put(varKey, varValue);
    }

    public void putResult(String varKey, Object varValue){
        this.results.put(varKey, varValue);
    }
    
    public void putParams(String varKey, Object varValue){
        this.params.put(varKey, varValue);
    }
    
    public Object param(String key) {
		return params.get(key);
	}

}
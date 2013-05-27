import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="role")
public class RoleModel {
	@Id
	private BigDecimal id;
	private String role;
	private boolean isDeprecated;
	
	/**
	 * @return the id
	 */
	public BigDecimal getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(BigDecimal id) {
		this.id = id;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
}

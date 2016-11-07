/*package com.wg.game.domain.common;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "user")
public class User implements Serializable {
	
	
	
	public User()
	{
		
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username", length = 50)
	private String username;

	@Column(name = "password", length = 500)
	private String password;

	@Column(name = "realname", length = 255)
	private String realname;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "mobile", length = 255)
	private String mobile;

	@Transient
	private String verifyCode;
	
	@Transient
	private String msgCode;

	@Column(name = "activated", length = 1)
	private boolean activated = true;

	@Column(name = "activationkey", length = 100)
	private String activationKey;

	@Column(name = "resetpasswordkey", length = 100)
	private String resetPasswordKey;

	@Column(name = "salt", length = 20)
	private Long salt;

	@Column(name = "referrals_mobile", length = 255)
	private String referralsMobile; // 介绍人手机号码
	
	//用户头像图片地址
	@Column(name = "image_url", length = 255)
	private String imageUrl;
	
	//性别 1 男 2 女 3 保密
	@Column(name = "sex", length = 2)
	private Integer sex;
	
	
	private Date createDate;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getActivated() {
		return this.activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public String getActivationKey() {
		return this.activationKey;
	}

	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}

	public String getResetPasswordKey() {
		return this.resetPasswordKey;
	}

	public void setResetPasswordKey(String resetPasswordKey) {
		this.resetPasswordKey = resetPasswordKey;
	}

	
	public Long getSalt() {
		return this.salt;
	}

	public void setSalt(Long salt) {
		this.salt = salt;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getReferralsMobile() {
		return referralsMobile;
	}

	public void setReferralsMobile(String referralsMobile) {
		this.referralsMobile = referralsMobile;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

//	@Override
//	public String toString() {
//		return "User [id=" + id + ", username=" + username + ", password=" + password + ", realname=" + realname
//				+ ", email=" + email + ", mobile=" + mobile + ", verifyCode=" + verifyCode + ", activated=" + activated
//				+ ", activationKey=" + activationKey + ", resetPasswordKey=" + resetPasswordKey + ", salt=" + salt
//				+ ", referralsMobile=" + referralsMobile + ", imageUrl=" + imageUrl + ", authorities=" + roles
//				+ "]";
//	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Transient
	public String getCreateDateStr() {
		if(null != this.getCreateDate()) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			return formatter.format(this.getCreateDate());
		}
		return "";
	}
	
}*/
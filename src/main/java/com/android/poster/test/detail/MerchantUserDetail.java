package com.android.poster.test.detail;

/**
 * @author Virendra
 * @since 16/08/24
 */
public class MerchantUserDetail extends AccountDetail{
    private static final long serialVersionUID = 0L;
    //private String accountId;authToken
    private String fname;
    private String accountUID;
    private String lname;
    private String gender;
    private String addressId;
    private String telephone;
    private String businessEntityId;
    private int type;
    private String position;
    private MerchantDetail merchantDetail;
    private MerchantDetail entityDetail;
    private String emailpassword;
    private String roleName;
    private boolean isDeleted;
    private String deliveredOn;
    private String status;
    private ProductConfigurationDetail 	productConfigurationDetail;

    public MerchantDetail getMerchantDetail() {
        return merchantDetail;
    }

    public void setMerchantDetail(MerchantDetail merchantDetail) {
        this.merchantDetail = merchantDetail;
    }

	/*public MerchantUserDetail()
	{
		setInsertMode(true);
	}

	public MerchantUserDetail(String fname, String lname,String gender,String addressId,String telephone,String businessEntityId,
								int type)
    {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.addressId = addressId;
		this.telephone = telephone;
		this.businessEntityId = businessEntityId;
		this.type = type;
		setInsertMode(true);
    } */

    /**
     * @author Simran
     * entityDetail created because earlier we used merchant detail but now because of entity framework changes we get entityDetail
     * since 19/12/22
     * @version SPR_V_6_0
     */
    public MerchantDetail getEntityDetail() {
        return entityDetail;
    }

    public void setEntityDetail(MerchantDetail entityDetail) {
        this.entityDetail = entityDetail;
    }
    public String getAccountUID() {
        return accountUID;
    }

    public void setAccountUID(String accountUID) {
        this.accountUID = accountUID;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname=fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname=lname;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender=gender;
    }


    public String getAddressId()
    {
        return addressId;
    }

    public void setAddressId(String addressId)
    {
        this.addressId=addressId;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone=telephone;
    }

    public String getBusinessEntityId()
    {
        return businessEntityId;
    }

    public void setBusinessEntityId(String businessEntityId)
    {
        this.businessEntityId=businessEntityId;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type=type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmailpassword() {
        return emailpassword;
    }

    public void setEmailpassword(String emailpassword) {
        this.emailpassword = emailpassword;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public boolean getIsDeleted() {
        //isDeleted = getBooleanFlagValue("inActiveMerchantuser", FlagConstants.kMerchantUserFlags);
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
        //manageFlags(isDeleted, "inActiveMerchantuser", FlagConstants.kMerchantUserFlags);
    }

    public String getDeliveredOn() {
        return deliveredOn;
    }

    public void setDeliveredOn(String deliveredOn) {
        this.deliveredOn = deliveredOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductConfigurationDetail getProductConfigurationDetail() {
        return productConfigurationDetail;
    }

    public void setProductConfigurationDetail(ProductConfigurationDetail productConfigurationDetail) {
        this.productConfigurationDetail = productConfigurationDetail;
    }
}

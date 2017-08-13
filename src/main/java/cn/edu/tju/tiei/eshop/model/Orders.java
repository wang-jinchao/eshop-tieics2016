package cn.edu.tju.tiei.eshop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Orders implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.customer_id
     *
     * @mbg.generated
     */
    private String customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.status_id
     *
     * @mbg.generated
     */
    private Integer statusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.payment_method_id
     *
     * @mbg.generated
     */
    private Integer paymentMethodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.send_method_id
     *
     * @mbg.generated
     */
    private Integer sendMethodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.place_time
     *
     * @mbg.generated
     */
    private Date placeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.send_time
     *
     * @mbg.generated
     */
    private Date sendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.invoice_title
     *
     * @mbg.generated
     */
    private String invoiceTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.invoice_item
     *
     * @mbg.generated
     */
    private String invoiceItem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.customer_id
     *
     * @return the value of orders.customer_id
     *
     * @mbg.generated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.customer_id
     *
     * @param customerId the value for orders.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.status_id
     *
     * @return the value of orders.status_id
     *
     * @mbg.generated
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.status_id
     *
     * @param statusId the value for orders.status_id
     *
     * @mbg.generated
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.price
     *
     * @return the value of orders.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.price
     *
     * @param price the value for orders.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.payment_method_id
     *
     * @return the value of orders.payment_method_id
     *
     * @mbg.generated
     */
    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.payment_method_id
     *
     * @param paymentMethodId the value for orders.payment_method_id
     *
     * @mbg.generated
     */
    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.send_method_id
     *
     * @return the value of orders.send_method_id
     *
     * @mbg.generated
     */
    public Integer getSendMethodId() {
        return sendMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.send_method_id
     *
     * @param sendMethodId the value for orders.send_method_id
     *
     * @mbg.generated
     */
    public void setSendMethodId(Integer sendMethodId) {
        this.sendMethodId = sendMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.place_time
     *
     * @return the value of orders.place_time
     *
     * @mbg.generated
     */
    public String getPlaceTime() {
        return placeTime.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.place_time
     *
     * @param placeTime the value for orders.place_time
     *
     * @mbg.generated
     */
    public void setPlaceTime(String placeTime) {
        this.placeTime = Timestamp.valueOf(placeTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.send_time
     *
     * @return the value of orders.send_time
     *
     * @mbg.generated
     */
    public String getSendTime() {
        return sendTime.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.send_time
     *
     * @param sendTime the value for orders.send_time
     *
     * @mbg.generated
     */
    public void setSendTime(String sendTime) {
        this.sendTime = Timestamp.valueOf(sendTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.invoice_title
     *
     * @return the value of orders.invoice_title
     *
     * @mbg.generated
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.invoice_title
     *
     * @param invoiceTitle the value for orders.invoice_title
     *
     * @mbg.generated
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.invoice_item
     *
     * @return the value of orders.invoice_item
     *
     * @mbg.generated
     */
    public String getInvoiceItem() {
        return invoiceItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.invoice_item
     *
     * @param invoiceItem the value for orders.invoice_item
     *
     * @mbg.generated
     */
    public void setInvoiceItem(String invoiceItem) {
        this.invoiceItem = invoiceItem == null ? null : invoiceItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getStatusId() == null ? other.getStatusId() == null : this.getStatusId().equals(other.getStatusId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPaymentMethodId() == null ? other.getPaymentMethodId() == null : this.getPaymentMethodId().equals(other.getPaymentMethodId()))
            && (this.getSendMethodId() == null ? other.getSendMethodId() == null : this.getSendMethodId().equals(other.getSendMethodId()))
            && (this.getPlaceTime() == null ? other.getPlaceTime() == null : this.getPlaceTime().equals(other.getPlaceTime()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getInvoiceTitle() == null ? other.getInvoiceTitle() == null : this.getInvoiceTitle().equals(other.getInvoiceTitle()))
            && (this.getInvoiceItem() == null ? other.getInvoiceItem() == null : this.getInvoiceItem().equals(other.getInvoiceItem()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getStatusId() == null) ? 0 : getStatusId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPaymentMethodId() == null) ? 0 : getPaymentMethodId().hashCode());
        result = prime * result + ((getSendMethodId() == null) ? 0 : getSendMethodId().hashCode());
        result = prime * result + ((getPlaceTime() == null) ? 0 : getPlaceTime().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getInvoiceTitle() == null) ? 0 : getInvoiceTitle().hashCode());
        result = prime * result + ((getInvoiceItem() == null) ? 0 : getInvoiceItem().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerId=").append(customerId);
        sb.append(", statusId=").append(statusId);
        sb.append(", price=").append(price);
        sb.append(", paymentMethodId=").append(paymentMethodId);
        sb.append(", sendMethodId=").append(sendMethodId);
        sb.append(", placeTime=").append(placeTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", invoiceTitle=").append(invoiceTitle);
        sb.append(", invoiceItem=").append(invoiceItem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
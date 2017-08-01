/**
 * LIO - Order Management API
 * API de gerenciamento de pedidos da LIO.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.OrdersItems;
import io.swagger.client.model.OrdersTransactions;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse200 {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("number")
  private String number = null;
  @SerializedName("reference")
  private String reference = null;
  public enum StatusEnum {
     DRAFT,  ENTERED,  CANCELED,  PAID,  APPROVED,  REJECTED,  RE_ENTERED,  CLOSED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("updated_at")
  private Date updatedAt = null;
  @SerializedName("items")
  private List<OrdersItems> items = null;
  @SerializedName("notes")
  private String notes = null;
  @SerializedName("transactions")
  private List<OrdersTransactions> transactions = null;
  @SerializedName("price")
  private Integer price = null;
  @SerializedName("remaining")
  private Integer remaining = null;

  /**
   * UUID que identifica unicamente o pedido.
   **/
  @ApiModelProperty(required = true, value = "UUID que identifica unicamente o pedido.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Número do pedido. Gerelmente esse número representa o identificador do pedido em um sistema externo através da integração com parceiros.
   **/
  @ApiModelProperty(value = "Número do pedido. Gerelmente esse número representa o identificador do pedido em um sistema externo através da integração com parceiros.")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Referência do pedido. Utilizada para facilitar o acesso ou localização do mesmo.
   **/
  @ApiModelProperty(value = "Referência do pedido. Utilizada para facilitar o acesso ou localização do mesmo.")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * Status do pedido.
   **/
  @ApiModelProperty(required = true, value = "Status do pedido.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Data de criação do pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)
   **/
  @ApiModelProperty(required = true, value = "Data de criação do pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Data de última atualização do pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)
   **/
  @ApiModelProperty(required = true, value = "Data de última atualização do pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Lista de itens contidos no pedido.
   **/
  @ApiModelProperty(required = true, value = "Lista de itens contidos no pedido.")
  public List<OrdersItems> getItems() {
    return items;
  }
  public void setItems(List<OrdersItems> items) {
    this.items = items;
  }

  /**
   * Campo disponível para uso do Merchant para comunicação.
   **/
  @ApiModelProperty(value = "Campo disponível para uso do Merchant para comunicação.")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Lista de transações de pagamento (ou outros tipos) efetuadas no pedido.
   **/
  @ApiModelProperty(required = true, value = "Lista de transações de pagamento (ou outros tipos) efetuadas no pedido.")
  public List<OrdersTransactions> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<OrdersTransactions> transactions) {
    this.transactions = transactions;
  }

  /**
   * Valor total do pedido. Exemplo: O valor de R$ 10,00 é representado como 1000.
   **/
  @ApiModelProperty(required = true, value = "Valor total do pedido. Exemplo: O valor de R$ 10,00 é representado como 1000.")
  public Integer getPrice() {
    return price;
  }
  public void setPrice(Integer price) {
    this.price = price;
  }

  /**
   * Valor restante do pagamento do pedido.Exemplo: O valor de R$ 10,00 é representado como 1000.
   **/
  @ApiModelProperty(required = true, value = "Valor restante do pagamento do pedido.Exemplo: O valor de R$ 10,00 é representado como 1000.")
  public Integer getRemaining() {
    return remaining;
  }
  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return (this.id == null ? inlineResponse200.id == null : this.id.equals(inlineResponse200.id)) &&
        (this.number == null ? inlineResponse200.number == null : this.number.equals(inlineResponse200.number)) &&
        (this.reference == null ? inlineResponse200.reference == null : this.reference.equals(inlineResponse200.reference)) &&
        (this.status == null ? inlineResponse200.status == null : this.status.equals(inlineResponse200.status)) &&
        (this.createdAt == null ? inlineResponse200.createdAt == null : this.createdAt.equals(inlineResponse200.createdAt)) &&
        (this.updatedAt == null ? inlineResponse200.updatedAt == null : this.updatedAt.equals(inlineResponse200.updatedAt)) &&
        (this.items == null ? inlineResponse200.items == null : this.items.equals(inlineResponse200.items)) &&
        (this.notes == null ? inlineResponse200.notes == null : this.notes.equals(inlineResponse200.notes)) &&
        (this.transactions == null ? inlineResponse200.transactions == null : this.transactions.equals(inlineResponse200.transactions)) &&
        (this.price == null ? inlineResponse200.price == null : this.price.equals(inlineResponse200.price)) &&
        (this.remaining == null ? inlineResponse200.remaining == null : this.remaining.equals(inlineResponse200.remaining));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    result = 31 * result + (this.reference == null ? 0: this.reference.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    result = 31 * result + (this.notes == null ? 0: this.notes.hashCode());
    result = 31 * result + (this.transactions == null ? 0: this.transactions.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.remaining == null ? 0: this.remaining.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  transactions: ").append(transactions).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  remaining: ").append(remaining).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

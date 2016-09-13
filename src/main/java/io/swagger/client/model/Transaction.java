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
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;

import io.swagger.client.model.Card;
import io.swagger.client.model.PaymentProduct;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Transaction  {
  
  @SerializedName("id")
  private String id = null;
  public enum TransactionTypeEnum {
     PAYMENT,  CANCELLATION, 
  };
  @SerializedName("transaction_type")
  private TransactionTypeEnum transactionType = null;
  public enum StatusEnum {
     CONFIRMED,  PENDING,  CANCELLED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("terminal_number")
  private Integer terminalNumber = null;
  @SerializedName("card")
  private Card card = null;
  @SerializedName("number")
  private Integer number = null;
  @SerializedName("authorization_code")
  private Integer authorizationCode = null;
  @SerializedName("payment_product")
  private PaymentProduct paymentProduct = null;
  @SerializedName("amount")
  private String amount = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("updated_at")
  private Date updatedAt = null;

  /**
   * UUID que identifica unicamente a transação.
   **/
  @ApiModelProperty(required = true, value = "UUID que identifica unicamente a transação.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Tipo da transação.
   **/
  @ApiModelProperty(required = true, value = "Tipo da transação.")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  /**
   * Status da transação.
   **/
  @ApiModelProperty(required = true, value = "Status da transação.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Descrição da transação.
   **/
  @ApiModelProperty(value = "Descrição da transação.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Número do terminal da Cielo Lio em que o pagamento foi realizado.
   **/
  @ApiModelProperty(required = true, value = "Número do terminal da Cielo Lio em que o pagamento foi realizado.")
  public Integer getTerminalNumber() {
    return terminalNumber;
  }
  public void setTerminalNumber(Integer terminalNumber) {
    this.terminalNumber = terminalNumber;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Card getCard() {
    return card;
  }
  public void setCard(Card card) {
    this.card = card;
  }

  /**
   * Número Sequencial Único (NSU) da transação.
   **/
  @ApiModelProperty(required = true, value = "Número Sequencial Único (NSU) da transação.")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * Código de autorização da transação.
   **/
  @ApiModelProperty(required = true, value = "Código de autorização da transação.")
  public Integer getAuthorizationCode() {
    return authorizationCode;
  }
  public void setAuthorizationCode(Integer authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PaymentProduct getPaymentProduct() {
    return paymentProduct;
  }
  public void setPaymentProduct(PaymentProduct paymentProduct) {
    this.paymentProduct = paymentProduct;
  }

  /**
   * Valor da transação. Exemplo: O valor de R$ 10,00 é representado como 1000.
   **/
  @ApiModelProperty(required = true, value = "Valor da transação. Exemplo: O valor de R$ 10,00 é representado como 1000.")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Data da criação/inclusão do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)
   **/
  @ApiModelProperty(required = true, value = "Data da criação/inclusão do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Data da última atualização do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)
   **/
  @ApiModelProperty(required = true, value = "Data da última atualização do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return (id == null ? transaction.id == null : id.equals(transaction.id)) &&
        (transactionType == null ? transaction.transactionType == null : transactionType.equals(transaction.transactionType)) &&
        (status == null ? transaction.status == null : status.equals(transaction.status)) &&
        (description == null ? transaction.description == null : description.equals(transaction.description)) &&
        (terminalNumber == null ? transaction.terminalNumber == null : terminalNumber.equals(transaction.terminalNumber)) &&
        (card == null ? transaction.card == null : card.equals(transaction.card)) &&
        (number == null ? transaction.number == null : number.equals(transaction.number)) &&
        (authorizationCode == null ? transaction.authorizationCode == null : authorizationCode.equals(transaction.authorizationCode)) &&
        (paymentProduct == null ? transaction.paymentProduct == null : paymentProduct.equals(transaction.paymentProduct)) &&
        (amount == null ? transaction.amount == null : amount.equals(transaction.amount)) &&
        (createdAt == null ? transaction.createdAt == null : createdAt.equals(transaction.createdAt)) &&
        (updatedAt == null ? transaction.updatedAt == null : updatedAt.equals(transaction.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (transactionType == null ? 0: transactionType.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    result = 31 * result + (description == null ? 0: description.hashCode());
    result = 31 * result + (terminalNumber == null ? 0: terminalNumber.hashCode());
    result = 31 * result + (card == null ? 0: card.hashCode());
    result = 31 * result + (number == null ? 0: number.hashCode());
    result = 31 * result + (authorizationCode == null ? 0: authorizationCode.hashCode());
    result = 31 * result + (paymentProduct == null ? 0: paymentProduct.hashCode());
    result = 31 * result + (amount == null ? 0: amount.hashCode());
    result = 31 * result + (createdAt == null ? 0: createdAt.hashCode());
    result = 31 * result + (updatedAt == null ? 0: updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  transactionType: ").append(transactionType).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  terminalNumber: ").append(terminalNumber).append("\n");
    sb.append("  card: ").append(card).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  authorizationCode: ").append(authorizationCode).append("\n");
    sb.append("  paymentProduct: ").append(paymentProduct).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

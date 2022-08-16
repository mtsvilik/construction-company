package com.solvd.constructioncompany.info;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.Objects;

public class CardAccount extends BankAccount implements IOpen {

    private static final Logger LOGGER = LogManager.getLogger(CardAccount.class);

    private String nameOfCard;
    private String typeOfCard;

    public CardAccount(Long accountNumber, LocalDate foundationDate, String nameOfBank) {
        super(accountNumber, foundationDate, nameOfBank);
    }

    @Override
    public void openCardAccount() {
        LOGGER.info("Open a card account");
    }

    public String getNameOfCard() {
        return nameOfCard;
    }

    public void setNameOfCard(String nameOfCard) {
        this.nameOfCard = nameOfCard;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(String typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CardAccount that = (CardAccount) o;
        return Objects.equals(nameOfCard, that.nameOfCard) && Objects.equals(typeOfCard, that.typeOfCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfCard, typeOfCard);
    }

    @Override
    public String toString() {
        return "CardAccount{" +
                "nameOfCard='" + nameOfCard + '\'' +
                ", typeOfCard='" + typeOfCard + '\'' +
                '}';
    }
}

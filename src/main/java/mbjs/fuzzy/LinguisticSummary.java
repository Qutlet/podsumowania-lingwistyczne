package mbjs.fuzzy;

public class LinguisticSummary {

    Quantifier quantifier;
    Summarizer summarizer;
    Qualifier qualifier;

    public LinguisticSummary(Quantifier quantifier, Qualifier qualifier, Summarizer summarizer) {
        this.quantifier = quantifier;
        this.summarizer = summarizer;
        this.qualifier = qualifier;
    }

    public LinguisticSummary(Quantifier quantifier, Summarizer summarizer) {
        this.quantifier = quantifier;
        this.summarizer = summarizer;
    }


    @Override
    public String toString() {
        if (qualifier == null){
            return quantifier + "basketball players are/have " + summarizer;
        }else {
            return quantifier + "basketball players who are/have " + qualifier + " are/have " + summarizer;
        }
    }

    public String summaryP1F1(){
        return quantifier + "basketball players are/have " + summarizer;
    }

    public String summaryP1F2(){
        return quantifier + "basketball players who are/have " + qualifier + " are/have " + summarizer;
    }
}

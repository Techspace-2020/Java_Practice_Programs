package com.practice.string_problem;

public class CPQ_fectchPromo_OfferEndpointCheck {
    public static void main(String[] args) {
        ActorGetterSetter actorGetterSetter = new ActorGetterSetter();
        actorGetterSetter.setActorBuyer("Trail");
        actorGetterSetter.setActorSeller("Tech");
        System.out.println("Seller:"+actorGetterSetter.getActorSeller()+" "+"Buyer:"+actorGetterSetter.getActorBuyer());

        //StringCheck("Glasspromo","Web",actorGetterSetter.getActorBuyer(), actorGetterSetter.getActorSeller());
        StringCheck("GlassPromo","Digital","Public","TechUserTrail");
    }
    public static void StringCheck(String promoCode,String channel,String actorBuyer,String actorSeller){
       // System.out.println("v1/CPQ_FetchPromoOffer?Name=" + promoCode+"&context={\"Channel\""+":\"+channel+\""+","+\"ActorBuyer\""+":\""+actorBuyer+"\"+","+\"promotiontype\""+":\""+type+"\");
        //System.out.println("v1/CPQ_FetchPromoOffer?Name=" + promoCode+"&context={"+"\"Channel\""+":\""+channel+"\","+"\"ActorBuyer\""+":\""+actorBuyer+"\","+"\"ActorSeller\""+":\""+actorSeller+"\","+"\"promotiontype\":\"Sales\"}");
        System.out.println("");
        System.out.println("{\"Channel\":\"channel\",\"ActorBuyer\":\"actorBuyer\",\"ActorSeller\":\"actorSeller\",\"promotiontype\":\"Sales\"}");
        System.out.println("*******************");
        String fields ="{\"Channel\":\"channel\",\"ActorBuyer\":\"actorBuyer\",\"ActorSeller\":\"actorSeller\",\"promotiontype\":\"Sales\"}";
        String url = "v1/CPQ_FetchPromoOffer?Name=promoCode&context={fields}";
        String url1="";
        String url2="";
        if(url.contains("{fields}")){
            url1 = url.replaceAll("fields", "");
            url2 = url1.substring(0, url1.length() - 2);
        }
        System.out.println("***************MOFIFIED****************"+url1);
        System.out.println(url2+fields);
    }
}


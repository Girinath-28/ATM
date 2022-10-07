
public class HandleAtm {
    
    public static void updateDenomination(int amount, int denomination, HandleDenomination handleDenomination){
        if(amount==2000){
                handleDenomination.setTwoThousand(handleDenomination.getTwoThousand()+denomination);
        }
        else if(amount==500){
                handleDenomination.setFiveHundred(handleDenomination.getFiveHundred()+denomination);
        }
        else if(amount==100){
                handleDenomination.setOneHundred(handleDenomination.getOneHundred()+denomination);
        }
    }
    public static int reduceDenomination(int amount, int denomination, HandleDenomination handleDenomination){
        int flag1=0, flag2=0;
        if(amount==2000){
            if(handleDenomination.getTwoThousand()>0){
                handleDenomination.setTwoThousand(handleDenomination.getTwoThousand()-denomination);
                return 1;
            }
            else if(handleDenomination.getFiveHundred()>0){
                flag1=1;
                handleDenomination.setFiveHundred(handleDenomination.getFiveHundred()-denomination);
            }
            else if(handleDenomination.getOneHundred()>0){
                flag2=1;
                handleDenomination.setOneHundred(handleDenomination.getOneHundred()-denomination);
            }
        }
        else if(amount==500){
            if(handleDenomination.getFiveHundred()>0){
                if(flag1==0){
                    handleDenomination.setFiveHundred(handleDenomination.getFiveHundred()-denomination);
                    return 1;
                }
            }
            else if(handleDenomination.getOneHundred()>0)
                if(flag2==0)
                handleDenomination.setOneHundred(handleDenomination.getOneHundred()-denomination);
        }
        else if(amount==100){
            if(handleDenomination.getOneHundred()>0){
                if(flag2==0){
                handleDenomination.setOneHundred(handleDenomination.getOneHundred()-denomination);
                return 1;}
            }
        }
        return -1;
    }

    public static void updateDepositingAmount(AtmDatabase atmDatabase, HandleDenomination handleDenomination){
        int depositingAmount=handleDenomination.getTwoThousand()*2000+handleDenomination.getFiveHundred()*500+handleDenomination.getOneHundred()*100;
        atmDatabase.setDeposingAmount(depositingAmount);
        atmDatabase.setBalaceAmount(atmDatabase.getDeposingAmount());
    }

    public static void updateWithdraw(AtmDatabase atmDatabase, int withdrawAmount){
        atmDatabase.setWithdrawAmount(withdrawAmount);
        atmDatabase.setBalaceAmount(atmDatabase.getBalaceAmount()-withdrawAmount);
    }

    public static int[] dispensingDenomination(int[] notes, int withdrawAmount){
        int[] noteCounter=new int[notes.length];
        for(int i=0;i<notes.length;i++){
            if(withdrawAmount>=notes[i]){
                noteCounter[i]=withdrawAmount/notes[i];
                withdrawAmount=withdrawAmount-noteCounter[i]*notes[i];
            }
        }
        return noteCounter;
    }
}










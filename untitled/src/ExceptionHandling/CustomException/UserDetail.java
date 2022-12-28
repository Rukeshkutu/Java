package ExceptionHandling.CustomException;

public class UserDetail {
    public void checkVoterAge(int age) throws AgeInvalidException{
        if(age<=18){
            throw new AgeInvalidException("You cannnot Vote");

        }
        else {
            System.out.println("You Can Vote");
        }

    }
    public static void main(String[] args){
        UserDetail userDetail = new UserDetail();
        try {
            userDetail.checkVoterAge(10);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

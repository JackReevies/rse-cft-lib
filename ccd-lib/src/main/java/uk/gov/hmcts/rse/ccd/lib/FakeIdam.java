package uk.gov.hmcts.rse.ccd.lib;

import feign.Response;
import java.util.List;
import org.springframework.stereotype.Component;
import uk.gov.hmcts.reform.idam.client.IdamApi;
import uk.gov.hmcts.reform.idam.client.models.AuthenticateUserRequest;
import uk.gov.hmcts.reform.idam.client.models.AuthenticateUserResponse;
import uk.gov.hmcts.reform.idam.client.models.ExchangeCodeRequest;
import uk.gov.hmcts.reform.idam.client.models.GeneratePinRequest;
import uk.gov.hmcts.reform.idam.client.models.GeneratePinResponse;
import uk.gov.hmcts.reform.idam.client.models.TokenExchangeResponse;
import uk.gov.hmcts.reform.idam.client.models.TokenRequest;
import uk.gov.hmcts.reform.idam.client.models.TokenResponse;
import uk.gov.hmcts.reform.idam.client.models.UserDetails;
import uk.gov.hmcts.reform.idam.client.models.UserInfo;

@Component
public class FakeIdam implements IdamApi {
  @Override
  public UserDetails retrieveUserDetails(String authorisation) {
    throw new RuntimeException();
  }

  @Override
  public GeneratePinResponse generatePin(GeneratePinRequest requestBody, String authorisation) {
    throw new RuntimeException();
  }

  @Override
  public Response authenticatePinUser(String pin, String clientId, String redirectUri,
                                      String state) {
    throw new RuntimeException();
  }

  @Override
  public AuthenticateUserResponse authenticateUser(String authorisation,
                                                   AuthenticateUserRequest authenticateUserRequest) {
    throw new RuntimeException();
  }

  @Override
  public TokenExchangeResponse exchangeCode(ExchangeCodeRequest exchangeCodeRequest) {
    throw new RuntimeException();
  }

  @Override
  public UserInfo retrieveUserInfo(String authorisation) {

    return UserInfo.builder()
        .givenName("A")
        .familyName("Dev")
        .uid("banderous")
        .sub("a@b.com")
        .roles(List.of("sudo"))
        .build();
  }

  @Override
  public TokenResponse generateOpenIdToken(TokenRequest tokenRequest) {
    throw new RuntimeException();
  }

  @Override
  public UserDetails getUserByUserId(String authorisation, String userId) {
    throw new RuntimeException();
  }

  @Override
  public List<UserDetails> searchUsers(String authorisation, String elasticSearchQuery) {
    throw new RuntimeException();
  }
}

package GMVB.core;

import GMVB.core.BasePage;
import static GMVB.core.DriverFactory.getDriver;

public class Login extends BasePage  {



	public void acessarTelaInicial() {
		getDriver().get("http://server.target1.com.br:9025/account/login?returnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DGmvb-spa%26redirect_uri%3Dhttp%253A%252F%252Fserver.target1.com.br%253A9023%26response_type%3Did_token%2520token%26scope%3Dopenid%2520ssosa%2520profile%2520email%26state%3D15398109231110.9194364660206573%26nonce%3Dxyz");
	}


}
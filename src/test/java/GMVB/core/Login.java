package GMVB.core;

import GMVB.core.BasePage;
import static GMVB.core.DriverFactory.getDriver;

public class Login extends BasePage  {



	public void acessarTelaInicial() {
		getDriver().get("http://201.68.172.120:9020/#/login");
	}


}
package java.game.cars;

import java.game.*;

public class Prime_VT extends VehicleType
{
	public Prime_VT( int id )
	{
		VehicleModel vmd;

		prevalence = 0.0;

		// DLH 500 //
		vmd=new VehicleModel( cars.racers.Prime:0x00000006r, VS_USED );
		vtdarr.addElement( vmd );
		vmd.prevalence = 25.0;
		vmd.stockPrestige=876;	vmd.fullPrestige= 982;
		vmd.stockQM = qm_stock_Prime_DLH_500;	vmd.fullQM = qm_full_Prime_DLH_500;
		vmd.vehicleName = "Prime DLH 500";
		prevalence += vmd.prevalence;

		vmd=new VehicleModel( cars.racers.Prime:0x00000006r, VS_NRACE );
		vtdarr.addElement( vmd );
		vmd.minPower   = 2.0;	vmd.maxPower	= 2.0;
		vmd.prevalence = 50.0;
		vmd.stockPrestige=876;	vmd.fullPrestige= 982;
		vmd.stockQM = qm_stock_Prime_DLH_500;	vmd.fullQM = qm_full_Prime_DLH_500;
		vmd.vehicleName = "Prime DLH 500";

		// make color indexes //
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Reflex);

//		prevalence *= 1000.0;
	}
}

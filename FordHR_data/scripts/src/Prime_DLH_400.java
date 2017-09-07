package java.game.cars;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Prime_DLH_400 extends Prime_models
{
	public Prime_DLH_400( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Ford";
		model = MODEL_DLH_400;
		vehicleName = "'30 Ford Model A Sedan";
		name = "Ford chassis";

		description = "Hot Rod version";

		value = mHUF2USD(2.741);
		brand_new_prestige_value = 95.90;

		fully_stripped_drag = 0.48;
		brake_balance_can_be_set = 1;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(36) );
		exhaustSlotIDList.addElement( new Integer(37) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[30];
		stock_parts_list_E[ 0] = parts.engines.MC_Prime_SuperDuty:0x00000001r; // "MC GT block" //
		stock_parts_list_E[ 1] = parts.engines.MC_Prime_SuperDuty:0x0000009Br; // "crankshaft bearing" //
		stock_parts_list_E[ 2] = parts.engines.MC_Prime_SuperDuty:0x00000105r; // "MC GTLE crankshaft" //
		stock_parts_list_E[ 3] = parts.engines.MC_Prime_SuperDuty:0x00000106r; // "MC GTLE connecting rods" //
		stock_parts_list_E[ 4] = parts.engines.MC_Prime_SuperDuty:0x00000102r; // "MC GTB GTLE pistons" //
		stock_parts_list_E[ 5] = parts.engines.MC_Prime_SuperDuty:0x000000ADr; // "Hauler Left head" //
		stock_parts_list_E[ 6] = parts.engines.MC_Prime_SuperDuty:0x000000AFr; // "Hauler right head" //
		stock_parts_list_E[ 7] = parts.engines.MC_Prime_SuperDuty:0x00000003r; // "MC GT left exhaust cam" //
		stock_parts_list_E[ 8] = parts.engines.MC_Prime_SuperDuty:0x0000004Dr; // "Prime DLH left intake cam" //
		stock_parts_list_E[ 9] = parts.engines.MC_Prime_SuperDuty:0x000000FCr; // "MC GT right exhaust cam" //
		stock_parts_list_E[ 10] = parts.engines.MC_Prime_SuperDuty:0x00000050r; // "Prime right intake cam" //
		stock_parts_list_E[ 11] = parts.engines.MC_Prime_SuperDuty:0x000000BBr; // "l camshaft bearing" //
		stock_parts_list_E[ 12] = parts.engines.MC_Prime_SuperDuty:0x000000BAr; // "r camshaft bearing" //
		stock_parts_list_E[ 13] = parts.engines.MC_Prime_SuperDuty:0x000000BDr; // "l cylinder cover" //
		stock_parts_list_E[ 14] = parts.engines.MC_Prime_SuperDuty:0x000000BCr; // "r cylinder cover" //
		stock_parts_list_E[ 15] = parts.engines.MC_Prime_SuperDuty:0x000000A1r; // "Intake manifold superduty 500" //
		stock_parts_list_E[ 16] = parts.HRpack:0x00000032r; // "SuperDuty_E750_supercharger" //
		stock_parts_list_E[ 17] = parts.HRpack:0x00000028r; // "SD500 carbs" //
		stock_parts_list_E[ 18] = parts.HRpack:0x00000027r; // "Air box" //
		stock_parts_list_E[ 19] = parts.HRpack:0x00000031r; // "roots type supercharger drive belt" //
		stock_parts_list_E[ 20] = parts.engines.MC_Prime_SuperDuty:0x00000097r; // "SD alternator drive belt" //
		stock_parts_list_E[ 21] = parts.engines.MC_Prime_SuperDuty:0x0000009Ar; // "SD camshaft drive belt" //
		stock_parts_list_E[ 22] = parts.engines.MC_Prime_SuperDuty:0x00000083r; // "Prime flywheel" //
		stock_parts_list_E[ 23] = parts.engines.MC_Prime_SuperDuty:0x00000084r; // "Prime clutch" //
		stock_parts_list_E[ 24] = parts.engines.MC_Prime_SuperDuty:0x00000107r; // "MC GTLE 6speed tranny" //
		stock_parts_list_E[ 25] = parts.engines.MC_Prime_SuperDuty:0x00000095r; // "MC oilpan" //
		stock_parts_list_E[ 26] = parts.engines.MC_Prime_SuperDuty:0x00000096r; // "SD alternator" //
		stock_parts_list_E[ 27] = parts.HRpack:0x00000029r; // "l exhaust header" //
		stock_parts_list_E[ 28] = parts.HRpack:0x0000002Cr; // "r exhaust header" //
		stock_parts_list_E[ 29] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.FordHR:0x000000B9r; // "L taillights" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.FordHR:0x000000C8r; // "R taillights" //

		stock_parts_list_F  = new int[9];
		stock_parts_list_F[ 2] = cars.racers.FordHR:0x000000D5r; // "F mask" //
		stock_parts_list_F[ 5] = cars.racers.FordHR:0x000000C0r; // "L headlights" //
		stock_parts_list_F[ 6] = cars.racers.FordHR:0x000000C5r; // "R headlights" //
		stock_parts_list_F[ 8] = cars.racers.FordHR:0x000000BCr; // "F windshield" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[ 1] = cars.racers.FordHR:0x000000B7r; // "FL door" //
		stock_parts_list_L[ 4] = cars.racers.FordHR:0x000000D3r; // "FL seat" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[ 1] = cars.racers.FordHR:0x000000C6r; // "FR door" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x00000209r; // "Prime_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x0000020Ar; // "Prime_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x0000020Br; // "Prime_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x0000020Cr; // "Prime_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000001BBr; // "shock_absorber_Prime_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000001BDr; // "shock_absorber_Prime_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000001E4r; // "spring_Prime_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000001E5r; // "spring_Prime_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000174r; // "brake_Prime_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000175r; // "brake_Prime_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x000001A0r; // "swaybar_Prime_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x000001A1r; // "swaybar_Prime_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.HRpack:0x0000002Fr; // "rim Prime_DLH 9.0 17 ET -30 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.HRpack:0x00000030r; // "rim Prime_DLH 10.0 17 ET -30 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.HRtires:0x00000007r; // "tyre 235 45 17 9.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.HRtires:0x00000008r; // "tyre 265 45 17 11.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.FordHR:0x000000C4r, "steering wheel" );


		if (desc.power > 1.4)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.MC_Prime_SuperDuty:0x000000BFr, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.4)/0.6*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			if (desc.power > 1.8)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			if (desc.power > 1.6)
			{
				addPart( parts:0x000001BFr, "24pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001C1r, "12pds canister" );
			}
		}
	}
}

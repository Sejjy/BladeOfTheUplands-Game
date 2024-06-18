package utils;

import main.Game;

public class Constants {

	public static class Environment {

		// CLOUDS
		public static final int BIG_CLOUD_WIDTH_DEFAULT = 576;
		public static final int BIG_CLOUD_HEIGHT_DEFAULT = 324;
		
		public static final int BIG_CLOUD_WIDTH = (int)(BIG_CLOUD_WIDTH_DEFAULT * Game.SCALE);
		public static final int BIG_CLOUD_HEIGHT = (int)(BIG_CLOUD_HEIGHT_DEFAULT * Game.SCALE);

		public static final int MED_CLOUD_WIDTH_DEFAULT = 576;
		public static final int MED_CLOUD_HEIGHT_DEFAULT = 324;
		
		public static final int MED_CLOUD_WIDTH = (int)(MED_CLOUD_WIDTH_DEFAULT * Game.SCALE);
		public static final int MED_CLOUD_HEIGHT = (int)(MED_CLOUD_HEIGHT_DEFAULT * Game.SCALE);

		public static final int SMALL_CLOUD_WIDTH_DEFAULT = 576;
		public static final int SMALL_CLOUD_HEIGHT_DEFAULT = 324;
		
		public static final int SMALL_CLOUD_WIDTH = (int)(SMALL_CLOUD_WIDTH_DEFAULT * Game.SCALE);
		public static final int SMALL_CLOUD_HEIGHT = (int)(SMALL_CLOUD_HEIGHT_DEFAULT * Game.SCALE);

		// GRASSLAND
		public static final int LAND_WIDTH_DEFAULT = 576;
		public static final int LAND_HEIGHT_DEFAULT = 324;

		public static final int LAND_WIDTH = (int)(LAND_WIDTH_DEFAULT * Game.SCALE);
		public static final int LAND_HEIGHT = (int)(LAND_HEIGHT_DEFAULT * Game.SCALE);

		// TREES
		public static final int TREE_WIDTH_DEFAULT = 576;
		public static final int TREE_HEIGHT_DEFAULT = 324;

		public static final int TREE_WIDTH = (int)(TREE_WIDTH_DEFAULT * Game.SCALE);
		public static final int TREE_HEIGHT = (int)(TREE_HEIGHT_DEFAULT * Game.SCALE);
	}

	public static class UI {
		public static class Buttons {
			public static final int B_WIDTH_DEFAULT = 140;
			public static final int B_HEIGHT_DEFAULT = 56;

			public static final int B_WIDTH = (int) (B_WIDTH_DEFAULT * Game.SCALE);
			public static final int B_HEIGHT = (int) (B_HEIGHT_DEFAULT * Game.SCALE);

		}
		public static class PauseButtons {
			public static final int SOUND_SIZE_DEFAULT = 42;
			public static final int SOUND_SIZE = (int)(SOUND_SIZE_DEFAULT * Game.SCALE);
		}

		public static class UrmButtons {
			public static final int URM_DEFAULT_SIZE = 56;
			public static final int URM_SIZE = (int)(URM_DEFAULT_SIZE * Game.SCALE);
		}

		public static class VolumeButtons {
			public static final int VOLUME_DEFAULT_WIDTH = 28;
			public static final int VOLUME_DEFAULT_HEIGHT = 44;
			public static final int SLIDER_DEFAULT_WIDTH = 215;

			public static final int VOLUME_WIDTH = (int)(VOLUME_DEFAULT_WIDTH * Game.SCALE);
			public static final int VOLUME_HEIGHT = (int)(VOLUME_DEFAULT_HEIGHT * Game.SCALE);
			public static final int SLIDER_WIDTH = (int)(SLIDER_DEFAULT_WIDTH * Game.SCALE);
		}	
	}
	public static class Directions {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}

	public static class PlayerConstants {
		public static final int IDLE = 0;
		public static final int RUNNING = 1;
		public static final int JUMP = 2;
		public static final int FALLING = 3;
		public static final int HIT = 4;
		public static final int ATTACK_1 = 5;

		public static int GetSpriteAmount(int player_action) {
			switch (player_action) {
			case RUNNING:
				return 6;
			case ATTACK_1:
			case HIT:
			case IDLE:
				return 4;
			case JUMP:
				return 3;
			default:
				return 2;
			}
		}
	}

}
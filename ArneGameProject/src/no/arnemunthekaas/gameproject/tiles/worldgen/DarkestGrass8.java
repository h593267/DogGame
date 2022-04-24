package no.arnemunthekaas.gameproject.tiles.worldgen;

import no.arnemunthekaas.gameproject.gfx.Assets;
import no.arnemunthekaas.gameproject.tiles.Tile;

public class DarkestGrass8 extends Tile {
	
	public DarkestGrass8(int id) {
		super(Assets.darkestGrass, id);

	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}

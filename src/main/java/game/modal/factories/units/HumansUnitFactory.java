package game.modal.factories.units;

import game.exceptions.modal.entities.battlefield.cell.OccupiedCellException;
import game.exceptions.modal.factories.units.UnitTypeException;
import game.modal.entities.battlefield.Cell;
import game.modal.entities.player.Player;
import game.modal.entities.units.Unit;
import game.modal.entities.units.UnitType;
import game.modal.entities.units.humans.Archer;
import game.modal.entities.units.humans.Cavalry;
import game.modal.entities.units.humans.Knight;

public class HumansUnitFactory implements UnitFactory{

    @Override
    public Unit getUnit(UnitType unitType, Cell position, Player owner) throws OccupiedCellException, UnitTypeException {
        if (unitType != null){
            switch (unitType){
                case KNIGHT:
                    return new Knight(position, owner);
                case ARCHER:
                    return new Archer(position, owner);
                case CAVALRY:
                    return new Cavalry(position, owner);
            }
        }
        throw new UnitTypeException();
    }
}

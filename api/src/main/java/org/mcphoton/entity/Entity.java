package org.mcphoton.entity;

import org.mcphoton.utils.Location;
import org.mcphoton.utils.Vector;
import org.mcphoton.world.World;

/**
 * Base interface for entites.
 * <h2>About thread-safety</h2>
 * Thanks to the new photon thread model, the entities generally don't need to be thread-safe.
 *
 * @author TheElectronWill
 * @author DJmaxZPLAY
 */
public interface Entity {
	/**
	 * @return the entity's id.
	 */
	int getId();

	/**
	 * Initializes the entity. This method may only be called once.
	 */
	void init(int entityId, double x, double y, double z, World w);

	/**
	 * @return true if the entity is valid, ie if it has been initialized but not invalidated yet.
	 */
	boolean isValid();

	/**
	 * Invalidates the entity.
	 */
	void invalidate();

	/**
	 * @return the entity's type.
	 */
	EntityType getType();

	/**
	 * @return the entity's custom name.
	 */
	String getCustomName();

	/**
	 * Sets the entity's custom name.
	 */
	void setCustomName(String customName);

	/**
	 * @return true if custom name is visible
	 */
	boolean isCustomNameVisible();

	/**
	 * Sets if the custom name of the entity is visible.
	 *
	 * @param visibility true if custom name must be shown.
	 */
	void setCustomNameVisible(boolean visibility);

	/**
	 * @return the velocity (speed) per ticks of the entity.
	 */
	Vector getVelocity();

	/**
	 * Sets the entity's velocity. Please consider using {@link #getVelocity()} and modifying the DoubleVector
	 * instead of using this method.
	 *
	 * @param v the new entity velocity.
	 */
	void setVelocity(Vector v);

	/**
	 * @return the current entity's location.
	 */
	Location getLocation();

	/**
	 * Teleports the entity.
	 *
	 * @param location the location to teleport the entity to.
	 * @return true if the teleportation succeeds.
	 */
	boolean teleport(Location location);

	/**
	 * @return true if the entity is on the ground.
	 */
	boolean isOnGround();

	/**
	 * Sets if the entity is on the ground.
	 *
	 * @param onGround true if the entity on the ground.
	 */
	void setOnGround(boolean onGround);

	/**
	 * @return true if the entity is on fire.
	 */
	boolean isOnFire();

	/**
	 * Sets if the entity is on fire.
	 *
	 * @param onFire true if the entity is on fire. Setting this to false will also sets the "fire ticks"
	 * counter to 0.
	 */
	void setOnFire(boolean onFire);

	/**
	 * @return the number of ticks this entity will stay in fire. 0 if it's not in fire.
	 */
	int getFireTicks();

	/**
	 * Sets the number of ticks this entity will stay in fire.
	 *
	 * @param ticks number of ticks this entity will stay in fire. 0 to stop the fire.
	 */
	void setFireTicks(int ticks);

	/**
	 * @return true if this entity is crouched.
	 */
	boolean isCrouched();

	/**
	 * Sets if the entity is crouched.
	 *
	 * @param crouched true if it's crouched.
	 */
	void setCrouched(boolean crouched);

	/**
	 * @return true if the entity is sprinting.
	 */
	boolean isSprinting();

	/**
	 * Sets if the entity is sprinting.
	 *
	 * @param sprinting true if it's sprinting.
	 */
	void setSprinting(boolean sprinting);

	/**
	 * @return true if the entity is subject to gravity.
	 */
	boolean hasGravity();

	/**
	 * Sets if the entity is subject to gravity.
	 *
	 * @param gravity true if the gravity should be applied.
	 */
	void setGravity(boolean gravity);

	/**
	 * @return true if the entity is glowing.
	 */
	boolean isGlowing();

	/**
	 * Sets if the entity glows.
	 *
	 * @param glow true if the entity glows.
	 */
	void setGlowing(boolean glow);

	/**
	 * @return true if the entity is silent.
	 */
	boolean isSilent();

	/**
	 * Sets if the entity is silent.
	 *
	 * @param silent true if the entity is silent.
	 */
	void setSilent(boolean silent);
}
/*************************************************************************************************
 * This file is part of ISPyB.
 * 
 * ISPyB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ISPyB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with ISPyB.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors : S. Delageniere, R. Leal, L. Launer, K. Levik, S. Veyrier, P. Brenchereau, M. Bodin, A. De Maria Antolinos
 ****************************************************************************************************/

package ispyb.server.mx.daos.autoproc;

import ispyb.server.mx.vos.autoproc.AutoProcIntegration3VO;

import java.util.List;

import javax.ejb.Local;

/**
 * <p>
 * 	The data access object for AutoProcIntegration3 objects (rows of table
 *  AutoProcIntegration).
 * </p>
 */
@Local
public interface AutoProcIntegration3DAO {

	/* Creation/Update methods ---------------------------------------------- */

	/**
	 * <p>
	 *  Insert the given value object.
	 * 	TODO update this comment for insertion details.
	 * </p>
	 */
	public void create(AutoProcIntegration3VO vo) throws Exception;

	/**
	 * <p>
	 *  Update the given value object.
	 * 	TODO update this comment for update details.
	 * </p>
	 * @throws VOValidateException if the value object data integrity is not ok.
	 */
	public AutoProcIntegration3VO update(AutoProcIntegration3VO vo) throws Exception;

	/* Deletion methods ----------------------------------------------------- */

	/**
	 * <p>
	 * 	Deletes the given value object.
	 * </p>
	 * @param vo the value object to delete.
	 */
	public void delete(AutoProcIntegration3VO vo);

	/* Find methods --------------------------------------------------------- */

	/**
	 * <p>
	 * 	Returns the AutoProcIntegration3VO instance matching the given primary key.
	 * </p>
	 * <p>
	 *  <u>Please note</u> that the booleans to fetch relationships are needed <u>ONLY</u>
	 *  if the value object has to be used out the EJB container.
	 * </p>
	 * @param pk the primary key of the object to load.
	 * @param fetchRelation1 if true, the linked instances by the relation "relation1" will be set.
	 * @param fetchRelation2 if true, the linked instances by the relation "relation2" will be set.
	 */
	public AutoProcIntegration3VO findByPk(Integer pk);

	/**
	 * <p>
	 * 	Returns the AutoProcIntegration3VO instances.
	 * </p>
	 * <p>
	 *  <u>Please note</u> that the booleans to fetch relationships are needed <u>ONLY</u>
	 *  if the value object has to be used out the EJB container.
	 * </p>
	 * @param fetchRelation1 if true, the linked instances by the relation "relation1" will be set.
	 * @param fetchRelation2 if true, the linked instances by the relation "relation2" will be set.
	 */
	public List<AutoProcIntegration3VO> findAll();

	/**
	 * 
	 * @param autoProcId
	 * @return
	 */
	public List<AutoProcIntegration3VO> findByAutoProcId(Integer autoProcId);
	
	/**
	 * get the autoProcStatus for a given dataCollectionId and a given processingProgram (fastProc or parallelProc or edna-fastproc)
	 * true if we can find at least one autoProc with XSCALE file
	 * @param dataCollectionId
	 * @param processingProgram
	 * @return
	 */
	public Boolean getAutoProcStatus(Integer dataCollectionId, String processingProgram);

	/**
	 * get the autoProcStatus for XIA2_DIALS
	 * @param dataCollectionId
	 * @param processingProgram
	 * @return
	 */
	public Boolean getAutoProcXia2DialsStatus(Integer dataCollectionId, String processingProgram);
}


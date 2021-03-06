/*
 * The MIT License
 * 
 * Copyright: Copyright (C) 2014 T2Ti.COM
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 * The author may be contacted at: t2ti.com@gmail.com
 *
 * @author Claudio de Barros (T2Ti.com)
 * @version 2.0
 */
package com.t2tierp.pcp.cliente;

import com.t2tierp.pcp.java.PcpOpDetalheVO;
import com.t2tierp.pcp.java.PcpServicoVO;
import java.util.ArrayList;
import java.util.Map;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import org.openswing.swing.util.java.Consts;

public class PcpServicoGridController extends GridController implements GridDataLocator {

    private PcpServicoGrid grid;
    private PcpOpDetalheVO opDetalhe;

    public PcpServicoGridController(PcpOpDetalheVO opDetalhe) {
        this.opDetalhe = opDetalhe;
        grid = new PcpServicoGrid(this);
        MDIFrame.add(grid);
        grid.getGrid1().reloadData();
        grid.getGridControl2().reloadData();
        grid.getGridControl3().reloadData();
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        if (opDetalhe != null) {
            if (opDetalhe.getListaPcpServico() != null) {
                return new VOListResponse(opDetalhe.getListaPcpServico(), false, opDetalhe.getListaPcpServico().size());
            }
        }
        return new VOListResponse();
    }

    @Override
    public void rowChanged(int rowNumber) {
        if (grid.getGrid1().getMode() != Consts.INSERT) {
            if (opDetalhe != null) {
                if (opDetalhe.getListaPcpServico() != null) {
                    grid.getColaboradorController().setServico(opDetalhe.getListaPcpServico().get(rowNumber));
                    grid.getGridControl2().reloadData();

                    grid.getEquipamentoController().setServico(opDetalhe.getListaPcpServico().get(rowNumber));
                    grid.getGridControl3().reloadData();
                }
            }
        }
    }

    @Override
    public Response insertRecords(int[] rowNumbers, ArrayList newValueObjects) throws Exception {
        if (opDetalhe != null) {
            if (opDetalhe.getListaPcpServico() != null) {
                for (int i = 0; i < newValueObjects.size(); i++) {
                    opDetalhe.getListaPcpServico().add((PcpServicoVO) newValueObjects.get(i));
                }
            }
        }
        return new VOListResponse(newValueObjects, false, newValueObjects.size());
    }

    @Override
    public Response updateRecords(int[] rowNumbers, ArrayList oldPersistentObjects, ArrayList persistentObjects) throws Exception {
        if (opDetalhe != null) {
            if (opDetalhe.getListaPcpServico() != null) {
                for (int i = 0; i < oldPersistentObjects.size(); i++) {
                    opDetalhe.getListaPcpServico().remove((PcpServicoVO) oldPersistentObjects.get(i));
                }
                for (int i = 0; i < persistentObjects.size(); i++) {
                    opDetalhe.getListaPcpServico().add((PcpServicoVO) persistentObjects.get(i));
                }
            }
        }
        return new VOListResponse(persistentObjects, false, persistentObjects.size());
    }

    @Override
    public Response deleteRecords(ArrayList persistentObjects) throws Exception {
        if (opDetalhe != null) {
            if (opDetalhe.getListaPcpServico() != null) {
                for (int i = 0; i < persistentObjects.size(); i++) {
                    opDetalhe.getListaPcpServico().remove((PcpServicoVO) persistentObjects.get(i));
                }
            }
        }
        return new VOListResponse(persistentObjects, false, persistentObjects.size());
    }

}

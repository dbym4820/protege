package org.protege.editor.owl.ui.action;

import org.semanticweb.owlapi.change.SplitSubClassAxioms;

import java.awt.event.ActionEvent;
/*
 * Copyright (C) 2007, University of Manchester
 *
 *
 */


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 15-Aug-2007<br><br>
 */
public class SplitSubClassAxiomsAction extends ProtegeOWLAction {


    public void initialise() throws Exception {
    }


    public void dispose() throws Exception {
    }


    public void actionPerformed(ActionEvent e) {
        SplitSubClassAxioms change = new SplitSubClassAxioms(getOWLModelManager().getActiveOntologies(),
                                                             getOWLDataFactory());
        getOWLModelManager().applyChanges(change.getChanges());
    }
}

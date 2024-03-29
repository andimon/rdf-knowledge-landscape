package com.andimon.rdf_knowledge_landscape.factories;

import org.semanticweb.owlapi.model.OWLObjectProperty;

public interface OntoKnowledgeLandscapeObjectPropertyFactory {
    OWLObjectProperty getRelatedToProperty();

    OWLObjectProperty getDependsOnProperty();

    OWLObjectProperty getComposedOfProperty();

    OWLObjectProperty getHasCategoryProperty();

    OWLObjectProperty getHasVisibilityProperty();

    OWLObjectProperty getHasSocialityProperty();

    OWLObjectProperty getHasOperationalityProperty();

    OWLObjectProperty getHasPerson();

    OWLObjectProperty getHasKnowledgeAsset();

}

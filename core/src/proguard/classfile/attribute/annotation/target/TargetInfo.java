/*
 * ProGuard Core -- library to process Java bytecode.
 *
 * Copyright (c) 2002-2019 Guardsquare NV
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package proguard.classfile.attribute.annotation.target;

import proguard.classfile.*;
import proguard.classfile.attribute.CodeAttribute;
import proguard.classfile.attribute.annotation.TypeAnnotation;
import proguard.classfile.attribute.annotation.target.visitor.TargetInfoVisitor;

/**
 * Representation of an annotation target.
 *
 * @author Eric Lafortune
 */
public abstract class TargetInfo
{
    public byte u1targetType;


    /**
     * Creates an uninitialized TargetInfo.
     */
    protected TargetInfo()
    {
    }


    /**
     * Creates an initialized TargetInfo.
     */
    protected TargetInfo(byte u1targetType)
    {
        this.u1targetType = u1targetType;
    }


    /**
     * Returns the type of the target.
     */
    public byte getTargetType()
    {
        return u1targetType;
    }


    // Methods to be implemented by extensions.

    /**
     * Accepts the given visitor, in the context of a type annotation on a class.
     */
    public void accept(Clazz clazz,                                             TypeAnnotation typeAnnotation, TargetInfoVisitor targetInfoVisitor)
    {
        throw new UnsupportedOperationException("Unsupported type annotation [0x"+Integer.toHexString(u1targetType)+"] on a class");
    }

    /**
     * Accepts the given visitor, in the context of a type annotation on a field.
     */
    public void accept(Clazz clazz, Field field,                                TypeAnnotation typeAnnotation, TargetInfoVisitor targetInfoVisitor)
    {
        throw new UnsupportedOperationException("Unsupported type annotation [0x"+Integer.toHexString(u1targetType)+"] on a field");
    }

    /**
     * Accepts the given visitor, in the context of a type annotation on a method.
     */
    public void accept(Clazz clazz, Method method,                              TypeAnnotation typeAnnotation, TargetInfoVisitor targetInfoVisitor)
    {
        throw new UnsupportedOperationException("Unsupported type annotation [0x"+Integer.toHexString(u1targetType)+"] on a method");
    }

    /**
     * Accepts the given visitor, in the context of a type annotation code.
     */
    public void accept(Clazz clazz, Method method, CodeAttribute codeAttribute, TypeAnnotation typeAnnotation, TargetInfoVisitor targetInfoVisitor)
    {
        throw new UnsupportedOperationException("Unsupported type annotation [0x"+Integer.toHexString(u1targetType)+"] on code");
    }
}
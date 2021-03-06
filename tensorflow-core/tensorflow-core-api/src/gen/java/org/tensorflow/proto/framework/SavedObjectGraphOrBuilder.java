// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/saved_object_graph.proto

package org.tensorflow.proto.framework;

public interface SavedObjectGraphOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SavedObjectGraph)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Flattened list of objects in the object graph.
   * The position of the object in this list indicates its id.
   * Nodes[0] is considered the root node.
   * </pre>
   *
   * <code>repeated .tensorflow.SavedObject nodes = 1;</code>
   */
  java.util.List<org.tensorflow.proto.framework.SavedObject> 
      getNodesList();
  /**
   * <pre>
   * Flattened list of objects in the object graph.
   * The position of the object in this list indicates its id.
   * Nodes[0] is considered the root node.
   * </pre>
   *
   * <code>repeated .tensorflow.SavedObject nodes = 1;</code>
   */
  org.tensorflow.proto.framework.SavedObject getNodes(int index);
  /**
   * <pre>
   * Flattened list of objects in the object graph.
   * The position of the object in this list indicates its id.
   * Nodes[0] is considered the root node.
   * </pre>
   *
   * <code>repeated .tensorflow.SavedObject nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * Flattened list of objects in the object graph.
   * The position of the object in this list indicates its id.
   * Nodes[0] is considered the root node.
   * </pre>
   *
   * <code>repeated .tensorflow.SavedObject nodes = 1;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.SavedObjectOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <pre>
   * Flattened list of objects in the object graph.
   * The position of the object in this list indicates its id.
   * Nodes[0] is considered the root node.
   * </pre>
   *
   * <code>repeated .tensorflow.SavedObject nodes = 1;</code>
   */
  org.tensorflow.proto.framework.SavedObjectOrBuilder getNodesOrBuilder(
      int index);

  /**
   * <pre>
   * Information about captures and output structures in concrete functions.
   * Referenced from SavedBareConcreteFunction and SavedFunction.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SavedConcreteFunction&gt; concrete_functions = 2;</code>
   */
  int getConcreteFunctionsCount();
  /**
   * <pre>
   * Information about captures and output structures in concrete functions.
   * Referenced from SavedBareConcreteFunction and SavedFunction.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SavedConcreteFunction&gt; concrete_functions = 2;</code>
   */
  boolean containsConcreteFunctions(
      java.lang.String key);
  /**
   * Use {@link #getConcreteFunctionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.proto.framework.SavedConcreteFunction>
  getConcreteFunctions();
  /**
   * <pre>
   * Information about captures and output structures in concrete functions.
   * Referenced from SavedBareConcreteFunction and SavedFunction.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SavedConcreteFunction&gt; concrete_functions = 2;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.proto.framework.SavedConcreteFunction>
  getConcreteFunctionsMap();
  /**
   * <pre>
   * Information about captures and output structures in concrete functions.
   * Referenced from SavedBareConcreteFunction and SavedFunction.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SavedConcreteFunction&gt; concrete_functions = 2;</code>
   */

  org.tensorflow.proto.framework.SavedConcreteFunction getConcreteFunctionsOrDefault(
      java.lang.String key,
      org.tensorflow.proto.framework.SavedConcreteFunction defaultValue);
  /**
   * <pre>
   * Information about captures and output structures in concrete functions.
   * Referenced from SavedBareConcreteFunction and SavedFunction.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SavedConcreteFunction&gt; concrete_functions = 2;</code>
   */

  org.tensorflow.proto.framework.SavedConcreteFunction getConcreteFunctionsOrThrow(
      java.lang.String key);
}

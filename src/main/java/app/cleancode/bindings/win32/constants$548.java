// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$548 {

    static final FunctionDescriptor GetServiceRegistryStateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceRegistryStateKey$MH = RuntimeHelper.downcallHandle(
        "GetServiceRegistryStateKey",
        constants$548.GetServiceRegistryStateKey$FUNC
    );
    static final FunctionDescriptor GetServiceDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceDirectory$MH = RuntimeHelper.downcallHandle(
        "GetServiceDirectory",
        constants$548.GetServiceDirectory$FUNC
    );
    static final MemorySegment OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK_EXPORT_NAME$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("OutOfProcessFunctionTableCallback");
    static final MemorySegment ACCESS_DS_SOURCE_A$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("DS");
    static final MemorySegment ACCESS_DS_SOURCE_W$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("D");
    static final MemorySegment ACCESS_DS_OBJECT_TYPE_NAME_A$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("Directory Service Object");
}



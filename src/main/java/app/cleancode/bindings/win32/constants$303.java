// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$303 {

    static final FunctionDescriptor CreateEnhMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEnhMetaFileA$MH = RuntimeHelper.downcallHandle(
        "CreateEnhMetaFileA",
        constants$303.CreateEnhMetaFileA$FUNC
    );
    static final FunctionDescriptor CreateEnhMetaFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEnhMetaFileW$MH = RuntimeHelper.downcallHandle(
        "CreateEnhMetaFileW",
        constants$303.CreateEnhMetaFileW$FUNC
    );
    static final FunctionDescriptor DeleteEnhMetaFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteEnhMetaFile$MH = RuntimeHelper.downcallHandle(
        "DeleteEnhMetaFile",
        constants$303.DeleteEnhMetaFile$FUNC
    );
    static final FunctionDescriptor EnumEnhMetaFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumEnhMetaFile$MH = RuntimeHelper.downcallHandle(
        "EnumEnhMetaFile",
        constants$303.EnumEnhMetaFile$FUNC
    );
    static final FunctionDescriptor GetEnhMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEnhMetaFileA$MH = RuntimeHelper.downcallHandle(
        "GetEnhMetaFileA",
        constants$303.GetEnhMetaFileA$FUNC
    );
    static final FunctionDescriptor GetEnhMetaFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEnhMetaFileW$MH = RuntimeHelper.downcallHandle(
        "GetEnhMetaFileW",
        constants$303.GetEnhMetaFileW$FUNC
    );
}



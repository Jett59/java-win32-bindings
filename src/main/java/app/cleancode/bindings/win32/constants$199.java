// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$199 {

    static final FunctionDescriptor CopyEnhMetaFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyEnhMetaFileW$MH = RuntimeHelper.downcallHandle(
        "CopyEnhMetaFileW",
        constants$199.CopyEnhMetaFileW$FUNC
    );
    static final FunctionDescriptor CreateEnhMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEnhMetaFileA$MH = RuntimeHelper.downcallHandle(
        "CreateEnhMetaFileA",
        constants$199.CreateEnhMetaFileA$FUNC
    );
    static final FunctionDescriptor CreateEnhMetaFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEnhMetaFileW$MH = RuntimeHelper.downcallHandle(
        "CreateEnhMetaFileW",
        constants$199.CreateEnhMetaFileW$FUNC
    );
    static final FunctionDescriptor DeleteEnhMetaFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteEnhMetaFile$MH = RuntimeHelper.downcallHandle(
        "DeleteEnhMetaFile",
        constants$199.DeleteEnhMetaFile$FUNC
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
        constants$199.EnumEnhMetaFile$FUNC
    );
    static final FunctionDescriptor GetEnhMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEnhMetaFileA$MH = RuntimeHelper.downcallHandle(
        "GetEnhMetaFileA",
        constants$199.GetEnhMetaFileA$FUNC
    );
}


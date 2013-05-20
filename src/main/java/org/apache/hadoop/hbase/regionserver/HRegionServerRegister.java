package org.apache.hadoop.hbase.regionserver;

public class HRegionServerRegister {


  private static HRegionServer last;

  public static void registerInstance(HRegionServer instance) {
    last = instance;
  }

  public static HRegionServer getLast() {
    return last;
  }
}

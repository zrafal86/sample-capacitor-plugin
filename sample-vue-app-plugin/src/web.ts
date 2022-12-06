import { WebPlugin } from '@capacitor/core';

import type { DataExchangerPlugin } from './definitions';

export class DataExchangerWeb extends WebPlugin implements DataExchangerPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

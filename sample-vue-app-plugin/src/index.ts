import { registerPlugin } from '@capacitor/core';

import type { DataExchangerPlugin } from './definitions';

const DataExchanger = registerPlugin<DataExchangerPlugin>('DataExchanger', {
  web: () => import('./web').then(m => new m.DataExchangerWeb()),
});

export * from './definitions';
export { DataExchanger };

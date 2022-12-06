export interface DataExchangerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
